import { Component } from '@angular/core';
import { Item } from '../item';
import { ItemService } from '../item.service';

@Component({
	selector: 'app-item-list',
	standalone: true,
	imports: [],
	templateUrl: './item-list.component.html',
	styleUrl: './item-list.component.css'
})

export class ItemListComponent {
	constructor(private itemService: ItemService) { }
	items: Item[] = [];
	
	// For calculate total
  	totalPrice: number = 0;
  	// Calculate total 
	public calculateTotalPrice(): void {
		this.totalPrice = this.items.reduce((total, item) => {
	        if (item.price !== undefined) {
	            return total + item.price;
	        } else {
	            return total;
	        }
	    }, 0);
	}
  	
	getItems(): void {
		this.itemService.getAll().subscribe({
			next: (data) => {
				this.items = data;
				this.calculateTotalPrice()
			}
		});
	}
	ngOnInit(): void {
		this.getItems();
		this.itemService.onItemAdded.subscribe(
			(data: Item) => {
				this.items.push(data) 
				this.calculateTotalPrice()
			}
		);
	}
	deleteItem(id: number): void {
		this.itemService.delete(id).subscribe({
			next: () => {
				this.items = this.items.filter(item => item.id !== id);
				this.calculateTotalPrice()
			}
		});
	}
}

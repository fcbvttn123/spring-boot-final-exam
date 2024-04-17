import { Component } from '@angular/core';
import { Item } from '../item';
import { ItemService } from '../item.service';
import { FormsModule } from '@angular/forms';

@Component({
	selector: 'app-item-add',
	standalone: true,
	imports: [FormsModule],
	templateUrl: './item-add.component.html',
	styleUrl: './item-add.component.css'
})
export class ItemAddComponent {

	constructor(private itemService: ItemService) { }

	item: Item = {
		id: 0,
		title: "",
		price: 0,
		dateTime: ""
	};

	saveItem(): void {
		const data = {
			//id: this.student.id,
			title: this.item.title,
			price: this.item.price,
			dateTime: this.item.dateTime
		};
		this.itemService.create(data).subscribe(
			(data: Item) => this.itemService.onItemAdded.emit(data)
		);
	}

}

import { Injectable } from '@angular/core';
import { EventEmitter } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Item } from './item';

const restUrl = '/api/v1/items';

@Injectable({
  providedIn: 'root'
})

export class ItemService {

  	constructor(private http: HttpClient) { }
  	// For calculate total
  	totalPrice: number = 0;
  	items: Item[] = [];
  
  	getAll(): Observable<Item[]> {
		return this.http.get<Item[]>(restUrl);
	}
	
	create(data: any): Observable<any> {
		return this.http.post(restUrl, data);
	}
	
	delete(id: number): Observable<any> {
		return this.http.delete(`${restUrl}/${id}`);
	}
	
	// Calculate total 
	private calculateTotalPrice(): void {
		this.totalPrice = this.items.reduce((total, item) => {
	        if (item.price !== undefined) {
	            return total + item.price;
	        } else {
	            return total;
	        }
	    }, 0);
	}
	
	onItemAdded = new EventEmitter<Item>();
  
}

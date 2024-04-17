import { Component } from '@angular/core';
import { ItemAddComponent } from './item-add/item-add.component';
import { ItemListComponent } from './item-list/item-list.component';

@Component({
  selector: 'app-items',
  standalone: true,
  imports: [ItemAddComponent, ItemListComponent],
  templateUrl: './items.component.html',
  styleUrl: './items.component.css'
})
export class ItemsComponent {

}

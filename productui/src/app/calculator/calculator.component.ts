import { ProductService } from './../product.service';
import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup,Validators} from '@angular/forms';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  priceLabel = '00.00'

  constructor(private productService : ProductService) { }

  itemNames = [
    { id: 1, name: 'Penguin-ears' },
    { id: 2, name: 'Horseshoe' }
 ];

 itemTypes = [
  { id: 1, name: 'unit' },
  { id: 2, name: 'carton' }
];

 selectedItemName: string = '';
 selectedItemType: string = '';

 onChangeItemName(itemName: string) {
    this.selectedItemName = itemName;
 }

 onChangeItemType(itemType: string) {
  this.selectedItemType = itemType;
}

calculate(item)
{

  this.calculatePrice(this.selectedItemName, this.selectedItemType, item.value);

}



calculatePrice(productName: string, productType:string, qty:number)
{


  console.log(productName);
  console.log(productType);
  console.log(qty);
  this.productService.calculatePrice(productName, productType, qty).subscribe(
    data => {
      console.log(data);
      this.priceLabel = data;
    }
  )
}



  ngOnInit() {
  }

}

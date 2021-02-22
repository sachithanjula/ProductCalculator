import { async } from '@angular/core/testing';
import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {

  priceLabel1 = '00.00';
  priceLabel2 = '00.00';

  productType = 'unit';
  myarr = [];
  myarr1 = [];

  constructor(private productService : ProductService) { }

  ngOnInit() {
    for (let i = 1; i <= 50; i++) {
      this.productService.calculatePrice("Penguin-ears", "unit", i).subscribe(
          (data) => {
          console.log(i + " "+data);
          this.myarr.push(data);
          console.log(this.myarr);
        }
      )
      this.productService.calculatePrice("Horseshoe", "unit", i).subscribe(
        (data) => {
        console.log(i + " "+data);
        this.myarr1.push(data);
        console.log(this.myarr1);
        }
      )

    }
    // for (let i = 1; i <= 50; i++) {
    //   this.productService.calculatePrice("Horseshoe", "unit", i).subscribe(
    //       (data) => {
    //       console.log(i + " "+data);
    //       this.myarr1.push(data);
    //       console.log(this.myarr1);
    //     }
    //   )
    // }
  }



}

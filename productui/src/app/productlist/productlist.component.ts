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

  constructor(private productService : ProductService) { }

  ngOnInit() {

  }

  getValues(item, item1)
  {

    this.calculateUnitPrice(item.id, item1.value);

  }

  calculateUnitPrice(productName: string, qty:number)
  {


    console.log(productName);
    console.log(this.productType);
    console.log(qty);

    if(productName === 'Penguin-ears')
    {

      for (let i = 1; i <= 50; i++) {
        this.productService.calculatePrice("Penguin-ears", "unit", i).subscribe(
           (data) => {
            console.log(i + " "+data);
          }
        )
      }


    }
    else
    {
      this.productService.calculatePrice(productName, this.productType, qty).subscribe(
        data => {
          console.log(data);
          this.priceLabel2 = data;
        }
      )
    }


  }

}

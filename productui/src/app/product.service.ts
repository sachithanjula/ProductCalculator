import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = 'http://localhost:8080/productcalculator_war/';

  constructor(private http:HttpClient) { }

  calculatePrice(productName: string, productType:string, qty:number): Observable<any> {
    return this.http.post(`${this.baseUrl}/get-price?productName=${productName}&productType=${productType}&qty=${qty}`, { responseType: 'number' });
  }

}

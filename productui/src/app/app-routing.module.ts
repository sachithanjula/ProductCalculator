import { ProductlistComponent } from './productlist/productlist.component';
import { AppComponent } from './app.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const appRoutes: Routes = [
  { path: '', redirectTo: '/products', pathMatch: 'full' },
  { path: 'calculator', component: CalculatorComponent },
  { path: 'products', component: ProductlistComponent }
]

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule
{

}

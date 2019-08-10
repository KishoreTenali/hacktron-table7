import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DisplayqueuesComponent } from './displayqueues/displayqueues.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AddqueueComponent } from './addqueue/addqueue.component';
import { RemovequeueComponent } from './removequeue/removequeue.component';

@NgModule({
  declarations: [
    AppComponent,
    DisplayqueuesComponent,
    HeaderComponent,
    FooterComponent,
    AddqueueComponent,
    RemovequeueComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

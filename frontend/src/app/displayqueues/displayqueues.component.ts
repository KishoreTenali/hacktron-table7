import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../services.service';

@Component({
  selector: 'app-displayqueues',
  templateUrl: './displayqueues.component.html',
  styleUrls: ['./displayqueues.component.css']
})
export class DisplayqueuesComponent implements OnInit {

  pageData:any;
  constructor(private servicesService:ServicesService) { }

  ngOnInit() {
    this.getData();
  }
  getData(){
    this.servicesService.getJsonData().subscribe((result: any[]) => {
      this.pageData = result;
      console.log(this.pageData);
    });
  }
}

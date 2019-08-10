import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-addqueue',
  templateUrl: './addqueue.component.html',
  styleUrls: ['./addqueue.component.css']
})
export class AddqueueComponent implements OnInit {
  queue:string;
  message:string;
  queueOutput:string;
  messageOutput:string;
  pageData:any;
  constructor() { }

  ngOnInit() {
  }

  onSubmit() {
    this.queueOutput=this.queue;
    this.messageOutput=this.message;
    console.log("queue",this.queue);   
   }
  
}

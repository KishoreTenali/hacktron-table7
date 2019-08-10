import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from "@angular/forms";

@Component({
  selector: 'app-removequeue',
  templateUrl: './removequeue.component.html',
  styleUrls: ['./removequeue.component.css']
})
export class RemovequeueComponent implements OnInit {
  queues: any = ['Queue1', 'Queue2', 'Queue3'];
  isSubmitted = false;
  constructor(public fb: FormBuilder) { }

  ngOnInit() {
  }

  registrationForm = this.fb.group({
    cityName: ['', [Validators.required]]
  })

  changeCity(e) {
    this.cityName.setValue(e.target.value, {
      onlySelf: true
    })
  }


  get cityName() {
    return this.registrationForm.get('cityName');
  }

  onSubmit() {
    console.log("submitted");
    this.isSubmitted = true;
    alert("Removed")
    

  }

}

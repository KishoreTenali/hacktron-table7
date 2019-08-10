import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  routePage(data) {
    if (data === 'Queues') {
      this.router.navigate(['Queues']);
    } else if (data === 'AddQueue') {
      this.router.navigate(['AddQueue'])

    } else if (data === 'Remove') {
      this.router.navigate(['Remove'])

    }
  }

}

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayqueuesComponent } from './displayqueues/displayqueues.component';
import { AddqueueComponent } from './addqueue/addqueue.component';
import { RemovequeueComponent } from './removequeue/removequeue.component';


const routes: Routes = [
  {path:'Queues',component:DisplayqueuesComponent},
  {path:'AddQueue',component:AddqueueComponent},
  {path:'Remove',component:RemovequeueComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

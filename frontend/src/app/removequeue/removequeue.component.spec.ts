import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemovequeueComponent } from './removequeue.component';

describe('RemovequeueComponent', () => {
  let component: RemovequeueComponent;
  let fixture: ComponentFixture<RemovequeueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemovequeueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemovequeueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

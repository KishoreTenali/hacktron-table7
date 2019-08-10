import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayqueuesComponent } from './displayqueues.component';

describe('DisplayqueuesComponent', () => {
  let component: DisplayqueuesComponent;
  let fixture: ComponentFixture<DisplayqueuesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayqueuesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayqueuesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

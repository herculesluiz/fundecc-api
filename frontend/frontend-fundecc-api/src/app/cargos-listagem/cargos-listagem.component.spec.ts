import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CargosListagemComponent } from './cargos-listagem.component';

describe('CargosListagemComponent', () => {
  let component: CargosListagemComponent;
  let fixture: ComponentFixture<CargosListagemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CargosListagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CargosListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

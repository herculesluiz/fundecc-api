import { Component, OnInit } from '@angular/core';
import { CargoService } from '../cargo.service';

@Component({
  selector: 'app-cargos-listagem',
  templateUrl: './cargos-listagem.component.html',
  styleUrls: ['./cargos-listagem.component.css']
})
export class CargosListagemComponent implements OnInit {

  cargos: Array<any>;


  constructor(private cargoService: CargoService) { }

  ngOnInit(): void {
    this.listar();
  }

  listar(){
    this.cargoService.listar().subscribe(dados => this.cargos = dados);
  }

}

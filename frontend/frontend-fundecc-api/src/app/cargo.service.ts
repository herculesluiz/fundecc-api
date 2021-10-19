import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class CargoService {

  cargosUrl = 'http://localhost:8080/cargos';
  constructor(private http: HttpClient) { }

  listar() {
    return this.http.get<any[]>('${this.cargosUrl}');
  }
}

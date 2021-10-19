import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { CargosListagemComponent } from './cargos-listagem/cargos-listagem.component';
import { CargoService } from './cargo.service';

@NgModule({
  declarations: [
    AppComponent,
    CargosListagemComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [CargoService],
  bootstrap: [AppComponent]
})
export class AppModule { }

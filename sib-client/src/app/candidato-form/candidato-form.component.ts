import { Component, OnInit } from '@angular/core';
import { CandidatoService } from '../services/candidato.service';


@Component({
  selector: 'app-candidato-form',
  templateUrl: './candidato-form.component.html',
  styleUrls: ['./candidato-form.component.css']
})
export class CandidatoFormComponent implements OnInit {

  constructor(private candidatoService: CandidatoService) { }

  candidato: any = {};
  selectedFile: File;

  linhasDePesquisa:any[] = [];
  linhaSelecionada:number = 0;

  ngOnInit() {
    this.getLinnhasDePesquisa();
  }

  getLinnhasDePesquisa(){
    this.candidatoService.getLinhasDePesquisa().subscribe(linhas => this.linhasDePesquisa = linhas);
  }

  insert() {
    this.candidatoService.insertCandidato(this.candidato).subscribe((candidato) => alert("Candidato submetido com id " + candidato.id));
  }


}

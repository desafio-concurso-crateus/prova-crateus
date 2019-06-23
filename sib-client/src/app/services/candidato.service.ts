import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

const URL = "http://localhost:8080/api/candidatos"


@Injectable({
  providedIn: 'root'
})
export class CandidatoService {

  constructor(private http: HttpClient, ) { }

  public insertCandidato(candidato): Observable<any> {


    return this.http.post(URL, candidato);

  }

  public getLinhasDePesquisa(): Observable<any[]> {
    return this.http.get<any[]>("https://crateus-challenge.herokuapp.com/research-lines").pipe(
      tap(_ => console.log('Linhas de pesquisa retornadas'))
    );
  }
}

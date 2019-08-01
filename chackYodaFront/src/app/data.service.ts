import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';
import { Location } from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class DataService {


  private url =  `http://localhost:8080/`  // "/";
  
  private factBehave = new BehaviorSubject<any>(undefined);
  fact = this.factBehave.asObservable();

  private factsArrayBehave = new BehaviorSubject<[any]>(undefined);
  factsArray = this.factsArrayBehave.asObservable();

  constructor(private http:HttpClient,private location: Location) {
    this.http.get('https://jsonip.com/').subscribe((data:any) => {
     console.log(data);
   //  this.url = `http://`+data.ip+`:80/server/`;
     this.getFacts();
});
   
   }
  
 getChackYodaFact(){

this.http.get(this.url+"getChackYodaFact").subscribe(data =>{
  if (data){
    console.log(data);
    this.factBehave.next(data);
  }
  
    },error => {console.log(error) })
 }
getFacts(){

  this.http.get(this.url+"facts").subscribe((data:[any]) =>{
    if (data){
      this.factsArrayBehave.next(data);
     
    }
    
  },error => {console.log(error) })
  
 }

 setFactToUndefined(){

  this.factBehave.next(undefined);
 }

}

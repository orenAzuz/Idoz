import { Component } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'app';
  fact:any;
  factsArray:any;
  snipper:boolean = false;
  constructor(private service:DataService){
    this.service.fact.subscribe(f => {this.fact = f; this.snipper = false; this.service.getFacts(); } );

  }

  getFact(){
  this.snipper = true;
  this.service.getChackYodaFact();
   
  }

  getAll(){
    this.factsArray = this.service.getFacts();
  }

  setFactToUndefined(){

    this.service.setFactToUndefined();
  }
}

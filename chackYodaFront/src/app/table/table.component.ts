import {Component, OnInit, ViewChild, NgModule} from '@angular/core';
import {MatPaginator, MatTableDataSource} from '@angular/material';
import { DataService } from '../data.service';


@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss']
})

export class TableComponent implements OnInit {
  displayedColumns: string[] = ['id', 'fact_text', 'enterd_date'];
  factsArray: PeriodicElement[] = [];
  dataSource;
  
  @ViewChild(MatPaginator) paginator: MatPaginator;

  
  constructor(private service:DataService) {
   
    this.service.factsArray.subscribe(arr => {
      this.factsArray = arr;
      this.dataSource = new MatTableDataSource<PeriodicElement>(this.factsArray);
      console.log(this.factsArray);
      this.dataSource.paginator = this.paginator;
    } );
    
   
   }

  ngOnInit() {
    
  }

}
  export interface PeriodicElement {
    id: number;
    fact_text: string;
    enterd_date:Date;
  }
  
  



import { NgModule } from '@angular/core'; 
import {MatBadgeModule} from '@angular/material/badge';


// import {MatBadgeModule} from '@angular/material/badge';
import { MatButtonModule,MatToolbarModule ,MatInputModule,MatDatepickerModule,MatDividerModule,MatListModule,
    MatNativeDateModule,MatExpansionModule ,MatProgressSpinnerModule,MatCardModule,MatTooltipModule,
    MatGridListModule,MatButtonToggleModule,MatTabsModule,MatSidenavModule,
    MatCheckboxModule,MatStepperModule,MatDialogModule,MatIconModule } from '@angular/material';

@NgModule({
   
    imports:[MatButtonModule,MatToolbarModule,MatInputModule,MatButtonToggleModule,MatListModule,
        MatDatepickerModule,MatNativeDateModule,MatExpansionModule, MatDividerModule,MatTabsModule,
        MatProgressSpinnerModule,MatCardModule,MatGridListModule,MatCheckboxModule,MatSidenavModule,
        MatBadgeModule,MatStepperModule,MatDialogModule,MatIconModule,MatTooltipModule,
         ],

    exports:[MatButtonModule,MatToolbarModule,MatInputModule,MatButtonToggleModule,MatListModule,
        MatDatepickerModule,MatNativeDateModule, MatExpansionModule,MatDividerModule,MatTabsModule,
        MatProgressSpinnerModule,MatCardModule,MatGridListModule,MatCheckboxModule,MatSidenavModule,
        MatBadgeModule,MatStepperModule,MatDialogModule,MatIconModule,MatTooltipModule,
         ],
 
}) 

export class MaterialModule {

}
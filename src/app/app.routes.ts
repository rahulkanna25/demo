import { Routes } from '@angular/router';
import { GamesComponent } from '../components/games/games.component';
import {TeamsComponent} from '../components/teams/teams.component';
import { TicketComponent } from '../components/buy-ticket/buy-ticket.component';
import { LoginComponent } from '../components/login/login.component';

export const routes: Routes = [
    {path:'games',component:GamesComponent},
    {
        path:'teams',
        component:TeamsComponent,
    },
    {
        path:'BuyTicket',
        component:TicketComponent,
    },
    {
        path:'login',
        component:LoginComponent
    }

];

import { Injectable } from '@angular/core';
 
@Injectable({
  providedIn: 'root'
})
export class HelloMessageService {
 
  constructor() {}
  getMessage(){
    return 'Hello People! This is message from service';
   }
}
 
 
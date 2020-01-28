import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UppercaseService {
  convertupper(str:String):String{
    return str.toUpperCase();
  }

  constructor() { }
}

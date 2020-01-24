import { Component, OnInit } from '@angular/core';
import {media} from'../model/media.model';
@Component({
  selector: 'media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {
  
  mediadetail:Array<media>;

  constructor() { 
    this.mediadetail = [
      new media("data","evening","cts","first"),
      new media("class","evening","cts","second"),
    new media("time","evening","cts","third"),
    new media("name","evening","cts","fourth")
    

    ];
  }
  savemedia(txttitle:HTMLInputElement, txtdescription:HTMLInputElement, txttags:HTMLInputElement,txtfilename:HTMLInputElement):void{
    let medias = new media(txttitle.value, txtdescription.value, txttags.value,txtfilename.value);
    // add that object to array
    this.mediadetail.push(medias);

    // reset the form
    txttitle.value = "";
    txtdescription.value = "";
    txttags.value = "";
    txtfilename.value="";
}
  ngOnInit() {
  }

}

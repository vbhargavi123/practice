import { Component, OnInit, Input } from '@angular/core';
import { media } from '../model/media.model';

@Component({
  selector: 'medialist',
  templateUrl: './medialist.component.html',
  styleUrls: ['./medialist.component.css']
})
export class MedialistComponent implements OnInit {

 @Input()
  medialist : Array<media>;

  constructor() { 
    
  }

  ngOnInit() {
  }

}

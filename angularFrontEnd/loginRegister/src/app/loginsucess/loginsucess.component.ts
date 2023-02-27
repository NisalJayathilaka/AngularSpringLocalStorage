import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-loginsucess',
  templateUrl: './loginsucess.component.html',
  styleUrls: ['./loginsucess.component.css']
})
export class LoginsucessComponent implements OnInit {

  user!:User
  constructor(private router: Router,private regiserServiec:RegisterService) { 
     
  }
  ngOnInit(): void {
     this.user = JSON.parse(localStorage.getItem('key')|| '{}')
  }
 //this.currentUser = JSON.parse(localStorage.getItem('currentUser')!);
}

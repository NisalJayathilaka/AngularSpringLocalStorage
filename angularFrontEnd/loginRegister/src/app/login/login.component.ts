import { Component, OnInit } from '@angular/core';
import {  Router,NavigationExtras } from '@angular/router';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
   
   user = new User();
   msg:string = ''
   users = new User();
  constructor(private regiserService:RegisterService, private router: Router ) { }

  ngOnInit(): void {
  }

 

  loginUser(){
     this.regiserService.userLogin(this.user).subscribe(
       (responce: User) =>{
        this.users = responce;
        this.makeAppoimnet()
       },
       error => {console.log("exception");
        this.msg = "Invalid userName or Password"
      }
     )
  }

  makeAppoimnet(){
    console.log(this.users);
    localStorage.setItem('key',JSON.stringify(this.users));
     this.regiserService.setUser(this.users);
  }

}

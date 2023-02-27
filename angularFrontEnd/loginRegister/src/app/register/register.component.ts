import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  user = new User();
  msg:string = ''
  constructor(private regiserService:RegisterService, private router: Router) { }

  ngOnInit(): void {
  }
  register(){
    this.regiserService.userRegister(this.user).subscribe(
      data=>{
         console.log("responce resived");
         this.msg = "register sucessfull";  
      },
      error=>{
        console.log("User Registation failed");
        this.msg = error.error
      }
    )
  }
}

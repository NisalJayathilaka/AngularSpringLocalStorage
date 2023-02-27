import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  private apiServeUrl = environment.baseUri;

  constructor(private http:HttpClient) { }

  public userLogin(user:User):Observable<any>{
     return this.http.post<any>(`${this.apiServeUrl}/api/v1/user/login`,user);
  }
  public userRegister(user:User):Observable<User>{
    return this.http.post<User>(`${this.apiServeUrl}/api/v1/user`,user);
  }

  user!:User

  setUser(user:User){
     this.user = user;
  }

  getUser(){
    return this.user;
  }
}

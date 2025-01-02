import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../interfaces/user';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private apiUrl = '/api/users'; // Proxy config

  constructor(private http: HttpClient) { }

  getUsers(): Observable<User[]> {

    return this.http.get<User[]>(this.apiUrl);
  }

  // Add users in DB
  createUser(user: User): Observable<User> {

    return this.http.post<User>(this.apiUrl, user);
  }
}

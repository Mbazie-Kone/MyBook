import { Component } from '@angular/core';
import { User } from '../../../interfaces/user';
import { UsersService } from '../../../services/users.service';

@Component({
  selector: 'app-add-user',
  standalone: false,
  
  templateUrl: './add-user.component.html',
  styleUrl: './add-user.component.css'
})
export class AddUserComponent {
  user: User = {id: 0, name: ''};

  constructor(private userService: UsersService) {}

  saveUser(): void {
    this.userService.createUser(this.user).subscribe(
      (response) => {
        console.log('User saved successfully', response);
      },
      (error) => {
        console.error('Error saving user:', error);
      }
    );
  }
}

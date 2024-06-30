import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationRequest } from '../../services/models';
import { AuthenticationService } from '../../services/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  authRequest: AuthenticationRequest = {
    email: '',
    password: ''
  };

  errorMsg: Array<string> = [];

constructor(
  private router: Router,
  private authService: AuthenticationService,
  // another service can be injected here
) {}

register() {
this.router.navigate(['register']);
}

login() {
  this.errorMsg = [];
  this.authService.authenticate({
    body:this.authRequest
  }).subscribe({
    next: () => {
      // save the token
      this.router.navigate(['books']);
    },
    error: (err) => {
      console.log(err);
    }
    });
  }
}
import React from 'react'
import { get } from '../helpers/fetcher'

import Users from './Users'

export default class UsersContainer extends React.Component {
  constructor(props) {
    super(props)
    this.state = {users: []}
  }

  componentWillMount() {
    this.getUsers()    
  }

  getUsers() {
    get('localhost:8080/users')
  }

  render() {
    return <Users {...{users: this.state.users}}/>
  }
}

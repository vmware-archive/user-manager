import React from 'react'

import UserListRow from './UserListRow'

export default class Users extends React.Component {
  render() {
    return (
      <ul>
         {this.props.users.map(user => <UserListRow {...{user}}/>)}
      </ul>
    )
  }
}

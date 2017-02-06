import React from 'react'
import expect from 'expect'
import { shallow } from 'enzyme'

import Users from '../../app/components/Users'
import UserListRow from '../../app/components/UserListRow'

describe('Users', () => {
  it('renders a user row', () => {
    const users = shallow(<Users {...{users: [{username: 'anything', password: 'something'}]}}/>)

    const userListRows = users.find(UserListRow)

    expect(userListRows.length).toEqual(1)
  })
})


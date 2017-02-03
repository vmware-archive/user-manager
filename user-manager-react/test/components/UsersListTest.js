import React from 'react'
import expect from 'expect'
import UserList, { UserListRow } from '../../app/components/UserList'
import { shallow } from 'enzyme'


describe('UserList', () => {
  it('renders a user row', () => {
    const userList = shallow(<UserList/>)
    const userListRows = userList.find(UserListRow)

    expect(userListRows.length).toEqual(1)
  })
})


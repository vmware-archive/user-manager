import React from 'react'
import expect from 'expect'
import { shallow } from 'enzyme'

import UsersContainer from '../../app/components/UsersContainer'
import * as fetcher from '../../app/helpers/fetcher'

describe('UserList', () => {
  it('getUsers requests calls get with correct url', () => {
    const getSpy = expect.spyOn(fetcher, 'get')

    UsersContainer.prototype.getUsers()

    expect(getSpy).toHaveBeenCalledWith('localhost:8080/users')
  });

  it('calls getUsers when component is mounted', () => {
    const fetchSpy = expect.spyOn(UsersContainer.prototype, 'getUsers')

    shallow(<UsersContainer/>)

    expect(fetchSpy).toHaveBeenCalled()
  })
})
import expect from 'expect'
import React from 'react'
import { shallow } from 'enzyme'
import App from '../../app/components/App'

describe('App', () => {
    it('displays the title', () => {
        const app = shallow(<App/>)
        expect(app.contains(<h1>User Manager</h1>)).toBe(true)
    })
})

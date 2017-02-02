import expect from 'expect'
import React from 'react'
import { shallow } from 'enzyme'
import AppComponent from '../src/js/AppComponent'

describe('AppComponent', () => {
    it('displays the title', () => {
	const appComponent = shallow(<AppComponent/>)

        expect(appComponent.contains(<h1>User Manager</h1>)).toBe(true)
    })
})

# User Manager

Experiments during beach time with Java Spring and React.

## Dependencies
- VirtualBox
- Vagrant

Both apps are Git submodules.

## Tests

`make tests-react`
`make tests-spring`

## CI

### First time setup
- Install [Vagrant](https://www.vagrantup.com/downloads.html)
- Install [Virtual Box](https://www.virtualbox.org/)
- `vagrant init concourse/lite`
- `vagrant up`
- Install [Fly CLI for Concourse](https://concourse.ci/downloads.html)
- `fly -t ci login http://192.168.100.4:8080/`
- `fly -t ci set-pipeline -p user-manager -c ci/pipeline.yml`
 
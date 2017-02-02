tests: tests-react tests-spring

tests-react:
	cd ./user-manager-react && make tests && cd -

tests-spring:
	cd ./user-manager-spring && make tests && cd -

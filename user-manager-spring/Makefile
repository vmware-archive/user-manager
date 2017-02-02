refreshdb: refreshdb-dev refreshdb-test

migrate-dev:
	psql -d user_management_dev -f ./src/main/resources/db/migration.sql

migrate-test:
	psql -d user_management_test -f ./src/main/resources/db/migration.sql

refreshdb-dev:
	dropdb --if-exists -e user_management_dev
	createdb -e user_management_dev
	psql -d user_management_dev -f ./src/main/resources/db/migration.sql

refreshdb-test:
	dropdb --if-exists -e user_management_test
	createdb -e user_management_test
	psql -d user_management_test -f ./src/main/resources/db/migration.sql

tests:
	./gradlew clean test build

start:
	java -jar build/libs/osusume-java-spring-0.0.1-SNAPSHOT.jar

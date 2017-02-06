#!/bin/sh

chown postgres:postgres -R /tmp/build

/etc/init.d/postgresql start

sudo -u postgres -H sh -c "dropdb --if-exists -e user_manager_test && createdb -e user_manager_test && psql -d user_manager_test -f ./src/main/resources/db/migration.sql && ./gradlew clean test build"
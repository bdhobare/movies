#!/bin/bash

eval "$(ssh-agent -s)" # Start ssh-agent cache
chmod 600 travis # Allow read access to the private key
ssh-add travis # Add the private key to SSH

git config --global push.default matching
git remote add deploy ssh://bdhobare@$IP:$PORT$DEPLOY_DIR
git push deploy master

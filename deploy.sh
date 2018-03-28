#!/bin/bash

eval "$(ssh-agent -s)" # Start ssh-agent cache
chmod 600 laplace # Allow read access to the private key
ssh-add laplace # Add the private key to SSH

git config --global push.default matching
git remote add deploy ssh://obare_obadiah@$IP:$PORT$DEPLOY_DIR
git push deploy master
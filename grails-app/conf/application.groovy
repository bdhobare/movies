// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.rest.token.storage.useJwt = false
grails.plugin.springsecurity.conf.rest.token.storage.jwt.secret = 'hBt6f68#vy8g7'
grails.plugin.springsecurity.rest.token.storage.useJwt = true
grails.plugin.springsecurity.rest.token.storage.jwt.useSignedJwt = true
grails.plugin.springsecurity.rest.token.storage.jwt.useEncryptedJwt = true
grails.plugin.springsecurity.userLookup.userDomainClassName = 'movies.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'movies.UserRole'
grails.plugin.springsecurity.authority.className = 'movies.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/',               access: ['permitAll']],
        [pattern: '/error',          access: ['permitAll']],
        [pattern: '/index',          access: ['permitAll']],
        [pattern: '/index.gsp',      access: ['permitAll']],
        [pattern: '/shutdown',       access: ['permitAll']],
        [pattern: '/assets/**',      access: ['permitAll']],
        [pattern: '/**/js/**',       access: ['permitAll']],
        [pattern: '/**/css/**',      access: ['permitAll']],
        [pattern: '/**/images/**',   access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/assets/**',      filters: 'none'],
        [pattern: '/**/js/**',       filters: 'none'],
        [pattern: '/**/css/**',      filters: 'none'],
        [pattern: '/**/images/**',   filters: 'none'],
        [pattern: '/**/favicon.ico', filters: 'none'],
        [pattern: '/api/**',         filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter']
]


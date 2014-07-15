<html>
<head>
    <title>Google Profile</title>
    <meta name='layout' content='bootstrap'/>
</head>

<body>


<div class="container">
  <div class="row">
    <div class="span9">
      <div class="form-container">
        <g:render template="/springsocial/google/googleMenu" model="['active':'index']"/>

        <h3>Your Google Profile</h3>

        <figure>
          <img src="${profile.imageUrl}"/>
          <figcaption>Hello, ${profile.givenName}</figcaption>
        </figure>

        <dl class="dl-horizontal">
            <dt>Google ID:</dt>
            <dd>${profile.accountEmail}</dd>
            <dt>Screen name:</dt>
            <dd><a href="${profile.url}" target="_blank">${profile.displayName}</a></dd>
            <dt>URL:</dt>
            <dd><a href="${profile.url}">${profile.url}</a></dd>
        </dl>

        <g:form method="DELETE" mapping="springSocialConnect" params="[providerId:'google']">
            <button class="btn btn-lg btn-danger" type="submit">Disconnect from Google</button>
        </g:form>

      </div>
    </div>
  </div>
</div>


</body>
</html>

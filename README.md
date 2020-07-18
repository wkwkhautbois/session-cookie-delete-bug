First, access to `/foo/`. Then JSESSIONID cookie with `Path=/foo` is published.

When Logout button is clicked, a cookie with `Path=/foo/` is tried to delete.  
No cookie is deleted and old invalid cookie is sent to server. Then redirect to session timeout error page.
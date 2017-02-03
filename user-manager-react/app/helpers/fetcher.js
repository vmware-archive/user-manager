
//const get = async (url) => {
//  const fetchResults = await fetch(url) => {
//  const jsonResults = await fetchResults.json

export const get = (url) => {
  return fetch(url, {
    headers: {
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token}`
    }
  }).then((response) => {
    return response.json()
  })
}
